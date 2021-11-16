package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AwsAuth {

  def apply(
    internalResourceId: String,
    cluster: software.amazon.awscdk.services.eks.Cluster
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eks.AwsAuth =
    software.amazon.awscdk.services.eks.AwsAuth.Builder
      .create(stackCtx, internalResourceId)
      .cluster(cluster)
      .build()
}
