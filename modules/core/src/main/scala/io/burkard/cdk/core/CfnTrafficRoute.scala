package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTrafficRoute {

  def apply(
    `type`: String,
    logicalId: String
  ): software.amazon.awscdk.CfnTrafficRoute =
    (new software.amazon.awscdk.CfnTrafficRoute.Builder)
      .`type`(`type`)
      .logicalId(logicalId)
      .build()
}
