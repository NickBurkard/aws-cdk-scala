package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFaqProps {

  def apply(
    name: String,
    s3Path: software.amazon.awscdk.services.kendra.CfnFaq.S3PathProperty,
    roleArn: String,
    indexId: String,
    fileFormat: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.kendra.CfnFaqProps =
    (new software.amazon.awscdk.services.kendra.CfnFaqProps.Builder)
      .name(name)
      .s3Path(s3Path)
      .roleArn(roleArn)
      .indexId(indexId)
      .fileFormat(fileFormat.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
