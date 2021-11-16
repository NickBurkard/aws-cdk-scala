package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMLTransform {

  def apply(
    internalResourceId: String,
    role: String,
    inputRecordTables: software.amazon.awscdk.services.glue.CfnMLTransform.InputRecordTablesProperty,
    transformParameters: software.amazon.awscdk.services.glue.CfnMLTransform.TransformParametersProperty,
    transformEncryption: Option[software.amazon.awscdk.services.glue.CfnMLTransform.TransformEncryptionProperty] = None,
    numberOfWorkers: Option[Number] = None,
    timeout: Option[Number] = None,
    glueVersion: Option[String] = None,
    name: Option[String] = None,
    maxCapacity: Option[Number] = None,
    description: Option[String] = None,
    tags: Option[AnyRef] = None,
    workerType: Option[String] = None,
    maxRetries: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.glue.CfnMLTransform =
    software.amazon.awscdk.services.glue.CfnMLTransform.Builder
      .create(stackCtx, internalResourceId)
      .role(role)
      .inputRecordTables(inputRecordTables)
      .transformParameters(transformParameters)
      .transformEncryption(transformEncryption.orNull)
      .numberOfWorkers(numberOfWorkers.orNull)
      .timeout(timeout.orNull)
      .glueVersion(glueVersion.orNull)
      .name(name.orNull)
      .maxCapacity(maxCapacity.orNull)
      .description(description.orNull)
      .tags(tags.orNull)
      .workerType(workerType.orNull)
      .maxRetries(maxRetries.orNull)
      .build()
}
