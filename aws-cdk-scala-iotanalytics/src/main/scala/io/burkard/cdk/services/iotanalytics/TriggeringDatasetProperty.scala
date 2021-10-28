package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TriggeringDatasetProperty {

  def apply(
    datasetName: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty.Builder)
      .datasetName(datasetName.orNull)
      .build()
}
