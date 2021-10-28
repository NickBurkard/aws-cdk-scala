package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UploadSettingsProperty {

  def apply(
    format: Option[String] = None,
    containsHeader: Option[Boolean] = None,
    textQualifier: Option[String] = None,
    startFromRow: Option[Number] = None,
    delimiter: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.UploadSettingsProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.UploadSettingsProperty.Builder)
      .format(format.orNull)
      .containsHeader(containsHeader.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .textQualifier(textQualifier.orNull)
      .startFromRow(startFromRow.orNull)
      .delimiter(delimiter.orNull)
      .build()
}
