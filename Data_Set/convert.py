import pandas as pd
from sympy import false
df = pd.read_parquet('logs_df.parquet')
df.isnull().sum()
df1=df.iloc[:100000]
df1.to_csv('logs_df.csv')


