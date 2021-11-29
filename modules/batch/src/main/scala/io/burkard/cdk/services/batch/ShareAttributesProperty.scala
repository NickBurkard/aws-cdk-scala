package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ShareAttributesProperty {

  def apply(
    weightFactor: Option[Number] = None,
    shareIdentifier: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnSchedulingPolicy.ShareAttributesProperty =
    (new software.amazon.awscdk.services.batch.CfnSchedulingPolicy.ShareAttributesProperty.Builder)
      .weightFactor(weightFactor.orNull)
      .shareIdentifier(shareIdentifier.orNull)
      .build()
}
