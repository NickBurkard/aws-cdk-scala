package io.burkard.cdk.services.cloudwatch

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnMetricStreamProps {

  def apply(
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    firehoseArn: Option[String] = None,
    excludeFilters: Option[List[_]] = None,
    includeFilters: Option[List[_]] = None,
    roleArn: Option[String] = None,
    outputFormat: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.CfnMetricStreamProps =
    (new software.amazon.awscdk.services.cloudwatch.CfnMetricStreamProps.Builder)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .firehoseArn(firehoseArn.orNull)
      .excludeFilters(excludeFilters.map(_.asJava).orNull)
      .includeFilters(includeFilters.map(_.asJava).orNull)
      .roleArn(roleArn.orNull)
      .outputFormat(outputFormat.orNull)
      .build()
}
