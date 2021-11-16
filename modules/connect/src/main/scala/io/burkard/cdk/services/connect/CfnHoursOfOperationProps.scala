package io.burkard.cdk.services.connect

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnHoursOfOperationProps {

  def apply(
    name: String,
    config: List[_],
    instanceArn: String,
    timeZone: String,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.connect.CfnHoursOfOperationProps =
    (new software.amazon.awscdk.services.connect.CfnHoursOfOperationProps.Builder)
      .name(name)
      .config(config.asJava)
      .instanceArn(instanceArn)
      .timeZone(timeZone)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
