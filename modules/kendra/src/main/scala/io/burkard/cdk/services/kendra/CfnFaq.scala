package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFaq {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    s3Path: Option[software.amazon.awscdk.services.kendra.CfnFaq.S3PathProperty] = None,
    fileFormat: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    roleArn: Option[String] = None,
    indexId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.kendra.CfnFaq =
    software.amazon.awscdk.services.kendra.CfnFaq.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .s3Path(s3Path.orNull)
      .fileFormat(fileFormat.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .roleArn(roleArn.orNull)
      .indexId(indexId.orNull)
      .build()
}
