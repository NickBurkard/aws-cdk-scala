package io.burkard.cdk.services.resourcegroups

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConfigurationItemProperty {

  def apply(
    `type`: Option[String] = None,
    parameters: Option[List[_]] = None
  ): software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationItemProperty =
    (new software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationItemProperty.Builder)
      .`type`(`type`.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}
