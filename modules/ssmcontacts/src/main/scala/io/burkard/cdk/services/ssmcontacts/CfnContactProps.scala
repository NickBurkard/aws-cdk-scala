package io.burkard.cdk.services.ssmcontacts

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnContactProps {

  def apply(
    displayName: Option[String] = None,
    alias: Option[String] = None,
    `type`: Option[String] = None,
    plan: Option[List[_]] = None
  ): software.amazon.awscdk.services.ssmcontacts.CfnContactProps =
    (new software.amazon.awscdk.services.ssmcontacts.CfnContactProps.Builder)
      .displayName(displayName.orNull)
      .alias(alias.orNull)
      .`type`(`type`.orNull)
      .plan(plan.map(_.asJava).orNull)
      .build()
}
