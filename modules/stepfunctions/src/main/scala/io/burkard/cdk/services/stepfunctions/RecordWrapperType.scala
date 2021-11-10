package io.burkard.cdk.services.stepfunctions


sealed abstract class RecordWrapperType(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.RecordWrapperType)
  extends Product
    with Serializable


object RecordWrapperType {
  implicit def toAws(value: RecordWrapperType): software.amazon.awscdk.services.stepfunctions.tasks.RecordWrapperType =
    Option(value).map(_.underlying).orNull

  case object None
    extends RecordWrapperType(software.amazon.awscdk.services.stepfunctions.tasks.RecordWrapperType.NONE)

  case object RecordIo
    extends RecordWrapperType(software.amazon.awscdk.services.stepfunctions.tasks.RecordWrapperType.RECORD_IO)
}
