package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnMLTransform {

  def apply(
    internalResourceId: String,
    transformEncryption: Option[software.amazon.awscdk.services.glue.CfnMLTransform.TransformEncryptionProperty] = None,
    numberOfWorkers: Option[Number] = None,
    role: Option[String] = None,
    inputRecordTables: Option[software.amazon.awscdk.services.glue.CfnMLTransform.InputRecordTablesProperty] = None,
    transformParameters: Option[software.amazon.awscdk.services.glue.CfnMLTransform.TransformParametersProperty] = None,
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
      .transformEncryption(transformEncryption.orNull)
      .numberOfWorkers(numberOfWorkers.orNull)
      .role(role.orNull)
      .inputRecordTables(inputRecordTables.orNull)
      .transformParameters(transformParameters.orNull)
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
