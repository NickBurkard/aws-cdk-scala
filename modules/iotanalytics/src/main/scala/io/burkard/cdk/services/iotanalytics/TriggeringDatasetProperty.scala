package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TriggeringDatasetProperty {

  def apply(
    datasetName: String
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty.Builder)
      .datasetName(datasetName)
      .build()
}
