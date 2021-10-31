package io.burkard.cdk.services.ssmcontacts

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
