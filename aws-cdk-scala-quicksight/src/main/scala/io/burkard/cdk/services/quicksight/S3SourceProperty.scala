package io.burkard.cdk.services.quicksight

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3SourceProperty {

  def apply(
    dataSourceArn: Option[String] = None,
    inputColumns: Option[List[_]] = None,
    uploadSettings: Option[software.amazon.awscdk.services.quicksight.CfnDataSet.UploadSettingsProperty] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.S3SourceProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.S3SourceProperty.Builder)
      .dataSourceArn(dataSourceArn.orNull)
      .inputColumns(inputColumns.map(_.asJava).orNull)
      .uploadSettings(uploadSettings.orNull)
      .build()
}
