class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groups = {}

        for s in strs:

            # Create sorted key
            key = ''.join(sorted(s))

            # If key is not present, create empty list
            if key not in groups:
                groups[key] = []

            # Add original string
            groups[key].append(s)

        # Return all groups
        return list(groups.values())