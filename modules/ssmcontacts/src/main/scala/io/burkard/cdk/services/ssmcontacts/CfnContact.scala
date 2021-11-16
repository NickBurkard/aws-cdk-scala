package io.burkard.cdk.services.ssmcontacts

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnContact {

  def apply(
    internalResourceId: String,
    displayName: String,
    alias: String,
    `type`: String,
    plan: List[_]
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ssmcontacts.CfnContact =
    software.amazon.awscdk.services.ssmcontacts.CfnContact.Builder
      .create(stackCtx, internalResourceId)
      .displayName(displayName)
      .alias(alias)
      .`type`(`type`)
      .plan(plan.asJava)
      .build()
}
