package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VariableProperty {

  def apply(
    variableName: String,
    doubleValue: Option[Number] = None,
    datasetContentVersionValue: Option[software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty] = None,
    outputFileUriValue: Option[software.amazon.awscdk.services.iotanalytics.CfnDataset.OutputFileUriValueProperty] = None,
    stringValue: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty.Builder)
      .variableName(variableName)
      .doubleValue(doubleValue.orNull)
      .datasetContentVersionValue(datasetContentVersionValue.orNull)
      .outputFileUriValue(outputFileUriValue.orNull)
      .stringValue(stringValue.orNull)
      .build()
}
