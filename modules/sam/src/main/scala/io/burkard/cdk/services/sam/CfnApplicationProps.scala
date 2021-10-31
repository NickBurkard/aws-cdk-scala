package io.burkard.cdk.services.sam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationProps {

  def apply(
    location0: Option[software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty] = None,
    location1: Option[String] = None,
    tags: Option[Map[String, String]] = None,
    notificationArns: Option[List[String]] = None,
    timeoutInMinutes: Option[Number] = None,
    parameters: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.sam.CfnApplicationProps =
    (new software.amazon.awscdk.services.sam.CfnApplicationProps.Builder)
      .location(location0.orNull)
      .location(location1.orNull)
      .tags(tags.map(_.asJava).orNull)
      .notificationArns(notificationArns.map(_.asJava).orNull)
      .timeoutInMinutes(timeoutInMinutes.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}
