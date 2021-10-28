package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EnvironmentOptions {

  def apply(
    removeInEdge: Option[Boolean] = None
  ): software.amazon.awscdk.services.lambda.EnvironmentOptions =
    (new software.amazon.awscdk.services.lambda.EnvironmentOptions.Builder)
      .removeInEdge(removeInEdge.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
