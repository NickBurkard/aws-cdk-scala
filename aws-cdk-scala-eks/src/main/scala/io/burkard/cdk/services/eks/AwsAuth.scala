package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AwsAuth {

  def apply(
    internalResourceId: String,
    cluster: Option[software.amazon.awscdk.services.eks.Cluster] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eks.AwsAuth =
    software.amazon.awscdk.services.eks.AwsAuth.Builder
      .create(stackCtx, internalResourceId)
      .cluster(cluster.orNull)
      .build()
}
