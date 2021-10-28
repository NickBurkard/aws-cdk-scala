package io.burkard.cdk.core

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStackProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    notificationArns: Option[List[String]] = None,
    templateUrl: Option[String] = None,
    timeoutInMinutes: Option[Number] = None,
    parameters: Option[Map[String, String]] = None
  ): software.amazon.awscdk.CfnStackProps =
    (new software.amazon.awscdk.CfnStackProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .notificationArns(notificationArns.map(_.asJava).orNull)
      .templateUrl(templateUrl.orNull)
      .timeoutInMinutes(timeoutInMinutes.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}