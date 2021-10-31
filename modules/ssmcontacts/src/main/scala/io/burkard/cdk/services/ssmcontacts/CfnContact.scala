package io.burkard.cdk.services.ssmcontacts

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnContact {

  def apply(
    internalResourceId: String,
    displayName: Option[String] = None,
    alias: Option[String] = None,
    `type`: Option[String] = None,
    plan: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ssmcontacts.CfnContact =
    software.amazon.awscdk.services.ssmcontacts.CfnContact.Builder
      .create(stackCtx, internalResourceId)
      .displayName(displayName.orNull)
      .alias(alias.orNull)
      .`type`(`type`.orNull)
      .plan(plan.map(_.asJava).orNull)
      .build()
}
