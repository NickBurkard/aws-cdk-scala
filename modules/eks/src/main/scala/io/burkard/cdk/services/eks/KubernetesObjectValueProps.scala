package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KubernetesObjectValueProps {

  def apply(
    jsonPath: String,
    cluster: software.amazon.awscdk.services.eks.ICluster,
    objectType: String,
    objectName: String,
    objectNamespace: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.eks.KubernetesObjectValueProps =
    (new software.amazon.awscdk.services.eks.KubernetesObjectValueProps.Builder)
      .jsonPath(jsonPath)
      .cluster(cluster)
      .objectType(objectType)
      .objectName(objectName)
      .objectNamespace(objectNamespace.orNull)
      .timeout(timeout.orNull)
      .build()
}
