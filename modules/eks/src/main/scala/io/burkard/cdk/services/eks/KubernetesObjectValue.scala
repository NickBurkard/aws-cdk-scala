package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KubernetesObjectValue {

  def apply(
    internalResourceId: String,
    jsonPath: String,
    cluster: software.amazon.awscdk.services.eks.ICluster,
    objectType: String,
    objectName: String,
    objectNamespace: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eks.KubernetesObjectValue =
    software.amazon.awscdk.services.eks.KubernetesObjectValue.Builder
      .create(stackCtx, internalResourceId)
      .jsonPath(jsonPath)
      .cluster(cluster)
      .objectType(objectType)
      .objectName(objectName)
      .objectNamespace(objectNamespace.orNull)
      .timeout(timeout.orNull)
      .build()
}
