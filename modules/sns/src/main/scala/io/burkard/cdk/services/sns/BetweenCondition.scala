package io.burkard.cdk.services.sns

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BetweenCondition {

  def apply(
    stop: Number,
    start: Number
  ): software.amazon.awscdk.services.sns.BetweenCondition =
    (new software.amazon.awscdk.services.sns.BetweenCondition.Builder)
      .stop(stop)
      .start(start)
      .build()
}
