package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KubernetesObjectValueProps {

  def apply(
    jsonPath: Option[String] = None,
    cluster: Option[software.amazon.awscdk.services.eks.ICluster] = None,
    objectType: Option[String] = None,
    objectNamespace: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    objectName: Option[String] = None
  ): software.amazon.awscdk.services.eks.KubernetesObjectValueProps =
    (new software.amazon.awscdk.services.eks.KubernetesObjectValueProps.Builder)
      .jsonPath(jsonPath.orNull)
      .cluster(cluster.orNull)
      .objectType(objectType.orNull)
      .objectNamespace(objectNamespace.orNull)
      .timeout(timeout.orNull)
      .objectName(objectName.orNull)
      .build()
}
