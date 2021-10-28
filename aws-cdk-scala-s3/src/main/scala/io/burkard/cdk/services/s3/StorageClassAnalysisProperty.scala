package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StorageClassAnalysisProperty {

  def apply(
    dataExport: Option[software.amazon.awscdk.services.s3.CfnBucket.DataExportProperty] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.StorageClassAnalysisProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.StorageClassAnalysisProperty.Builder)
      .dataExport(dataExport.orNull)
      .build()
}
