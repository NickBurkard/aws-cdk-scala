package io.burkard.cdk.services.ssmcontacts

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
