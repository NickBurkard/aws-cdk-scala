package io.burkard.cdk.services.kendra

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFaqProps {

  def apply(
    name: Option[String] = None,
    s3Path: Option[software.amazon.awscdk.services.kendra.CfnFaq.S3PathProperty] = None,
    fileFormat: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    roleArn: Option[String] = None,
    indexId: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnFaqProps =
    (new software.amazon.awscdk.services.kendra.CfnFaqProps.Builder)
      .name(name.orNull)
      .s3Path(s3Path.orNull)
      .fileFormat(fileFormat.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .roleArn(roleArn.orNull)
      .indexId(indexId.orNull)
      .build()
}