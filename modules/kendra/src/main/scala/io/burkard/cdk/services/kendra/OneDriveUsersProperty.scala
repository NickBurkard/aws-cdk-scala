package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OneDriveUsersProperty {

  def apply(
    oneDriveUserList: Option[List[String]] = None,
    oneDriveUserS3Path: Option[software.amazon.awscdk.services.kendra.CfnDataSource.S3PathProperty] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveUsersProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveUsersProperty.Builder)
      .oneDriveUserList(oneDriveUserList.map(_.asJava).orNull)
      .oneDriveUserS3Path(oneDriveUserS3Path.orNull)
      .build()
}
