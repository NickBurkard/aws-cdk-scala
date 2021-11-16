package io.burkard.cdk.services.events

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RunCommandTargetProperty {

  def apply(
    key: String,
    values: List[String]
  ): software.amazon.awscdk.services.events.CfnRule.RunCommandTargetProperty =
    (new software.amazon.awscdk.services.events.CfnRule.RunCommandTargetProperty.Builder)
      .key(key)
      .values(values.asJava)
      .build()
}
