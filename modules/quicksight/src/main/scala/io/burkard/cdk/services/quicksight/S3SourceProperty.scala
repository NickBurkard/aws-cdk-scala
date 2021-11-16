package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3SourceProperty {

  def apply(
    dataSourceArn: String,
    inputColumns: List[_],
    uploadSettings: Option[software.amazon.awscdk.services.quicksight.CfnDataSet.UploadSettingsProperty] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.S3SourceProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.S3SourceProperty.Builder)
      .dataSourceArn(dataSourceArn)
      .inputColumns(inputColumns.asJava)
      .uploadSettings(uploadSettings.orNull)
      .build()
}
