package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatasetContentVersionValueProperty {

  def apply(
    datasetName: String
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty.Builder)
      .datasetName(datasetName)
      .build()
}
