package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StageProps {

  def apply(
    outdir: Option[String] = None,
    env: Option[software.amazon.awscdk.Environment] = None
  ): software.amazon.awscdk.StageProps =
    (new software.amazon.awscdk.StageProps.Builder)
      .outdir(outdir.orNull)
      .env(env.orNull)
      .build()
}
