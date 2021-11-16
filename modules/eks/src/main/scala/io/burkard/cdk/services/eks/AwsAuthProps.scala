package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AwsAuthProps {

  def apply(
    cluster: software.amazon.awscdk.services.eks.Cluster
  ): software.amazon.awscdk.services.eks.AwsAuthProps =
    (new software.amazon.awscdk.services.eks.AwsAuthProps.Builder)
      .cluster(cluster)
      .build()
}
