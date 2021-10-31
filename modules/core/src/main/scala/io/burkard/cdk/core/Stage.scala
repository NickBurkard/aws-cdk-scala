package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Stage {

  def apply(
    internalResourceId: String,
    outdir: Option[String] = None,
    env: Option[software.amazon.awscdk.Environment] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.Stage =
    software.amazon.awscdk.Stage.Builder
      .create(stackCtx, internalResourceId)
      .outdir(outdir.orNull)
      .env(env.orNull)
      .build()
}
