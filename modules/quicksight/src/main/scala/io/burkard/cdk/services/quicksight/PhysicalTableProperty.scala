package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PhysicalTableProperty {

  def apply(
    customSql: Option[software.amazon.awscdk.services.quicksight.CfnDataSet.CustomSqlProperty] = None,
    s3Source: Option[software.amazon.awscdk.services.quicksight.CfnDataSet.S3SourceProperty] = None,
    relationalTable: Option[software.amazon.awscdk.services.quicksight.CfnDataSet.RelationalTableProperty] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.PhysicalTableProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.PhysicalTableProperty.Builder)
      .customSql(customSql.orNull)
      .s3Source(s3Source.orNull)
      .relationalTable(relationalTable.orNull)
      .build()
}
