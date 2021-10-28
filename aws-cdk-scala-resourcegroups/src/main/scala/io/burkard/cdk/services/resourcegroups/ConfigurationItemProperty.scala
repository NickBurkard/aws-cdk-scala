package io.burkard.cdk.services.resourcegroups

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
