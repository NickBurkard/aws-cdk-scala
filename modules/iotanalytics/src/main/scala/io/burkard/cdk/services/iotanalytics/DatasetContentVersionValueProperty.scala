package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DatasetContentVersionValueProperty {

  def apply(
    datasetName: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty.Builder)
      .datasetName(datasetName.orNull)
      .build()
}
