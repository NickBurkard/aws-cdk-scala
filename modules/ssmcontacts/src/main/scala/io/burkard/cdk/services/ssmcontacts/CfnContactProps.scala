package io.burkard.cdk.services.ssmcontacts

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnContactProps {

  def apply(
    displayName: String,
    alias: String,
    `type`: String,
    plan: List[_]
  ): software.amazon.awscdk.services.ssmcontacts.CfnContactProps =
    (new software.amazon.awscdk.services.ssmcontacts.CfnContactProps.Builder)
      .displayName(displayName)
      .alias(alias)
      .`type`(`type`)
      .plan(plan.asJava)
      .build()
}
