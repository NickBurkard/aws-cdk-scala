package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WithoutPolicyUpdatesOptions {

  def apply(
    addGrantsToResources: Option[Boolean] = None
  ): software.amazon.awscdk.services.iam.WithoutPolicyUpdatesOptions =
    (new software.amazon.awscdk.services.iam.WithoutPolicyUpdatesOptions.Builder)
      .addGrantsToResources(addGrantsToResources.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
