package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CsvOptionsProperty {

  def apply(
    headerRow: Option[Boolean] = None,
    delimiter: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnDataset.CsvOptionsProperty =
    (new software.amazon.awscdk.services.databrew.CfnDataset.CsvOptionsProperty.Builder)
      .headerRow(headerRow.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .delimiter(delimiter.orNull)
      .build()
}
