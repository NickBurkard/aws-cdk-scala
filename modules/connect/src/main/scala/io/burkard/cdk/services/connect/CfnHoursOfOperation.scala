package io.burkard.cdk.services.connect

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnHoursOfOperation {

  def apply(
    internalResourceId: String,
    name: String,
    config: List[_],
    instanceArn: String,
    timeZone: String,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.connect.CfnHoursOfOperation =
    software.amazon.awscdk.services.connect.CfnHoursOfOperation.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .config(config.asJava)
      .instanceArn(instanceArn)
      .timeZone(timeZone)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
