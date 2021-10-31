package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FormatOptionsProperty {

  def apply(
    json: Option[software.amazon.awscdk.services.databrew.CfnDataset.JsonOptionsProperty] = None,
    csv: Option[software.amazon.awscdk.services.databrew.CfnDataset.CsvOptionsProperty] = None,
    excel: Option[software.amazon.awscdk.services.databrew.CfnDataset.ExcelOptionsProperty] = None
  ): software.amazon.awscdk.services.databrew.CfnDataset.FormatOptionsProperty =
    (new software.amazon.awscdk.services.databrew.CfnDataset.FormatOptionsProperty.Builder)
      .json(json.orNull)
      .csv(csv.orNull)
      .excel(excel.orNull)
      .build()
}
