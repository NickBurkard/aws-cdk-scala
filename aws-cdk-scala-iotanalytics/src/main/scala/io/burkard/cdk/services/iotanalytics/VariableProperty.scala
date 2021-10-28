package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VariableProperty {

  def apply(
    doubleValue: Option[Number] = None,
    datasetContentVersionValue: Option[software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty] = None,
    variableName: Option[String] = None,
    outputFileUriValue: Option[software.amazon.awscdk.services.iotanalytics.CfnDataset.OutputFileUriValueProperty] = None,
    stringValue: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty.Builder)
      .doubleValue(doubleValue.orNull)
      .datasetContentVersionValue(datasetContentVersionValue.orNull)
      .variableName(variableName.orNull)
      .outputFileUriValue(outputFileUriValue.orNull)
      .stringValue(stringValue.orNull)
      .build()
}
