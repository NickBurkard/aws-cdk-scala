package io.burkard.cdk.services.connect

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnHoursOfOperationProps {

  def apply(
    name: Option[String] = None,
    config: Option[List[_]] = None,
    instanceArn: Option[String] = None,
    timeZone: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.connect.CfnHoursOfOperationProps =
    (new software.amazon.awscdk.services.connect.CfnHoursOfOperationProps.Builder)
      .name(name.orNull)
      .config(config.map(_.asJava).orNull)
      .instanceArn(instanceArn.orNull)
      .timeZone(timeZone.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
