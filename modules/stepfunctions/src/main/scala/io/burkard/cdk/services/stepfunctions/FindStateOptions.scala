package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FindStateOptions {

  def apply(
    includeErrorHandlers: Option[Boolean] = None
  ): software.amazon.awscdk.services.stepfunctions.FindStateOptions =
    (new software.amazon.awscdk.services.stepfunctions.FindStateOptions.Builder)
      .includeErrorHandlers(includeErrorHandlers.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
