from collections import defaultdict
class Solution(object):
    def groupAnagrams(self, strs):
        dict={}
        for i in strs:
            c=tuple(sorted(Counter(i).items()))
            if c in dict:
                dict[c].append(i)
            else:
                dict[c]=[i]
        return list(dict.values())
