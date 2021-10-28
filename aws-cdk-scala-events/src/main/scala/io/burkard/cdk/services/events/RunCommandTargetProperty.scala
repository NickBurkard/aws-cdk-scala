package io.burkard.cdk.services.events

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RunCommandTargetProperty {

  def apply(
    key: Option[String] = None,
    values: Option[List[String]] = None
  ): software.amazon.awscdk.services.events.CfnRule.RunCommandTargetProperty =
    (new software.amazon.awscdk.services.events.CfnRule.RunCommandTargetProperty.Builder)
      .key(key.orNull)
      .values(values.map(_.asJava).orNull)
      .build()
}
