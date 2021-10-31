package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AfterwardsOptions {

  def apply(
    includeOtherwise: Option[Boolean] = None,
    includeErrorHandlers: Option[Boolean] = None
  ): software.amazon.awscdk.services.stepfunctions.AfterwardsOptions =
    (new software.amazon.awscdk.services.stepfunctions.AfterwardsOptions.Builder)
      .includeOtherwise(includeOtherwise.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .includeErrorHandlers(includeErrorHandlers.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
