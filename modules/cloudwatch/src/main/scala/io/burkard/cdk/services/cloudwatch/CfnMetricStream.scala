package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMetricStream {

  def apply(
    internalResourceId: String,
    firehoseArn: String,
    roleArn: String,
    outputFormat: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    excludeFilters: Option[List[_]] = None,
    includeFilters: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudwatch.CfnMetricStream =
    software.amazon.awscdk.services.cloudwatch.CfnMetricStream.Builder
      .create(stackCtx, internalResourceId)
      .firehoseArn(firehoseArn)
      .roleArn(roleArn)
      .outputFormat(outputFormat)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .excludeFilters(excludeFilters.map(_.asJava).orNull)
      .includeFilters(includeFilters.map(_.asJava).orNull)
      .build()
}
